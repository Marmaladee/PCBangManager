# PCBangManager
SpringBoot Exercise

# For What?
* PC방 예약 관리 어플리케이션
Function
1. 로그인
 - 회원가입 / 탈퇴
 - 로그인(id/pwd/시간 여부)
 
2. 예약
 - 중간시간/Expire 시간 설정
  - 중간시간 이전에는 예약X
  - 중간시간 ~ Expire 시간 사이에는 예약 O/연장 O
  - Expire 시간 이후에는 예약 O / 연장 X
  
3. 적립/사용
 - 포인트제도
 - 시간으로 사용가능

4. 결제
 - 특정 금액에 대한 Signal을 값에 맵핑해서 시간 추가 or 삭제 기능
 
5. 남은시간 보여주기

BackEnd - SpringBoot + MySQL + Hibernate + JPA
UI - js + HTML5 + CSS
Test Framework - junit4 + postman
Build - gradle
CI/CD - github

FLow : BE -> junit -> postman -> UI -> 추가기능(UI 꾸미기, OAuth?)

 ## **git commit message style**
  * 커밋 메시지는 세가지 파트로 나누고 각 파트는 빈줄을 두어서 구분합나다.

    * type: subject

    * body(옵션)

    * footer(옵션)
  * type : 어떤 의도로 커밋했는지를 type에 명시합니다. 자세한 사항은 아래서 설명하겠습니다.
  * subject : 최대 50글자가 넘지 않도록 하고 마침표는 찍지 않습니다. 영문으로 표기하는 경우 동사(원형)을 가장 앞에 두고 첫글자는 대문자로 표기합니다. 
  * body: 긴 설명이 필요한 경우에 작성합니다. 어떻게 했는지가 아니라, 무엇을 왜 했는지 작성합니다. 최대 75글자를 넘기지 않도록 합니다.
  * footer : issue tracker ID를 명시하고 싶은 경우에 작성합니다.
  
  ### 타입
   * feat : 새로운 기능 추가
   * fix : 버그 수정
   * docs : 문서의 수정
   * style : (코드의 수정 없이) 스타일(style)만 변경(들여쓰기 같은 포맷이나 세미콜론을 빼먹은 경우)
   * refactor : 코드를 리펙토링
   * test : Test 관련한 코드의 추가, 수정
   * chore : (코드의 수정 없이) 설정을 변경

 ## Refs
  https://udacity.github.io/git-styleguide/

