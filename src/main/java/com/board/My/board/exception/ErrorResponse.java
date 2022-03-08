package com.board.My.board.exception;

import org.json.simple.JSONObject;

/**JSON으로 에러를 리턴하기 위해 JSON-simple이라는 의존성을 porn.xml에 추가**/
public class ErrorResponse {
    public static JSONObject JsonErrorResponse(int errorCode, String errorMessage){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errorCode", errorCode);
        jsonObject.put("errorMessage", errorMessage);
        return jsonObject;
    }

    /**      HTTP 상태 코드          |                          에러 원인 상세
     * ------------------------------------------------------------------------------------------
     *      400(요청 오류)           |                      요청이 잘못되었을 경우                    |
     *      401(인증 실패)           |    애플리케이션 클라이언트 아이디와 시크릿 갚이 없거나 잘못됐을 경우  |
     *  403(서버가 허용되지 않는 경우) |     필수 요청 변수가 빠졌거나 요청 변수 이름이 잘못되었을 경우       |
     *      404(API없음)            |                 API 요청 URL이 잘못되었을 경우                 |
     *      500(서버 오류)           |  API 호출은 정상적으로 됐지만 API 서버 시스템 오류로 인한 원인      |
     * ------------------------------------------------------------------------------------------|**/
}
