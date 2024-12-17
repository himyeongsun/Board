package com.example.board.Controller;

import com.example.board.Service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;

@Controller // get, post 매핑만 사용 가능
// @RestController - create modify remove get put
@RequiredArgsConstructor
@Log    //System.out.println을 대체
public class BoardController {
    private final BoardService boardService;

    // localhost로 접속 시 연결할 페이지()
}
