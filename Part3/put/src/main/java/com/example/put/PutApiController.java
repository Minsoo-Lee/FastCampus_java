package com.example.put;

import com.example.put.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public PutRequestDto put(@RequestBody PutRequestDto requestDto) {
        System.out.println("requestDto = " + requestDto);
        return requestDto;
    }

    @PutMapping("/put/{userId}")
    public PutRequestDto put2(@RequestBody PutRequestDto requestDto, @PathVariable(name = "userId") Long id) {
        System.out.println("id = " + id);
        return requestDto;
    }
}
