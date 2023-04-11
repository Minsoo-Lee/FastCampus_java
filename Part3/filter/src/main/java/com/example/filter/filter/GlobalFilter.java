package com.example.filter.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@Slf4j
@WebFilter(urlPatterns = "/api/user/*")
public class GlobalFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 전처리
        ContentCachingRequestWrapper httpRequest = new ContentCachingRequestWrapper((HttpServletRequest) request);
        ContentCachingResponseWrapper httpResponse = new ContentCachingResponseWrapper((HttpServletResponse) response);

        chain.doFilter(httpRequest, httpResponse);

        String url = httpRequest.getRequestURI();

        // 후처리
        String reqContent = new String(httpRequest.getContentAsByteArray());
        log.info("[request url] {}, [requestBody] {}", url, reqContent);

        String resContent = new String(httpResponse.getContentAsByteArray());
        int httpStatus = httpResponse.getStatus();
        log.info("[response status] {}, [responseBody] {}", httpStatus, resContent);
    }
}
