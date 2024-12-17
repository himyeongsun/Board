package com.example.board.DTO;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
//@Data
public class BoardDTO {
    // Entitu에 있는 변수들(사용)만 복사
    // 공통 삽입, 수정, 목록, 상세 보기
    // DTO로 삽입, 수정, 목록 등 개별적으로 작업
    private Integer id;
    private String subject;
    private String content;
    private String author;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
