package org.zerock.todo.mappers;

import org.zerock.todo.dto.ReplyDTO;

public interface ReplyMapper {
    
    /* gno가 0일 때 실행하는 영역 */
    // 댓글
    int insert(ReplyDTO replyDTO);

    // 댓글의 gno 업데이트
    int updateGno(Long rno);
    /* //gno가 0일 때 실행하는 영역 */

    /* gno가 0이 아닐 때 실행하는 영역 */
    // 대댓글
    int insertChild(ReplyDTO replyDTO);
    /* //gno가 0이 아닐 때 실행하는 영역 */

}
