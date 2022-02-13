package ch15;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private List<Board1> boardList = new ArrayList<>();

    public BoardDao() {
        boardList.add(new Board1("제목1", "내용1"));
        boardList.add(new Board1("제목2", "내용2"));
        boardList.add(new Board1("제목3", "내용3"));
    }

    public List<Board1> getBoardList() {
        return boardList;
    }
}
