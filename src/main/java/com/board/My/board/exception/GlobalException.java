package com.board.My.board.exception;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice           /**controller에서 발생할 수 있는 예외를 집어 처리해주는 annotation**/
@ResponseBody               /**=> 실질적으로 controller뿐만 아니라 Repository는 Service로 Service는 Controller로 집어 던지기 때문에 3곳 모두 예외처리한 셈이다. 다만 @ExceptionalHandler로 등록된 에러만 처리**/
public class GlobalException {

    @ExceptionHandler(DuplicateEmailException.class)
    public JSONObject duplicateEmailException(){
        return ErrorResponse.JsonErrorResponse(400,"중복된 이메일 입니다.");
    }


    /**                     에러 플로우
     * 1, Service에서 이메일 중복 에러가 발생 Controller로 집어 던짐
     * 2, 던져진 예외는 ContrllerAdvice 에서 처리
     * 3, ExceptionalHandler에 등록된 함수로 실행                **/
}
