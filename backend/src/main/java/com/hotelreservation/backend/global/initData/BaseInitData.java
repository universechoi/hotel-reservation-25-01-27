package com.hotelreservation.backend.global.initData;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@RequiredArgsConstructor
public class BaseInitData implements CommandLineRunner {
    @Override
    @Transactional
    public void run(String... args) {
        for (int i = 0; i < 10; i++) {
            String todo = String.format("테스트[%02d]", i);
            String description = "테스트 데이터 설명입니다.";
        }
    }
}
