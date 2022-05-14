<h1 align="center">
    <p>online-2D-fight-game</p>
</h1>

🎮 make simple online 2D fight game with Spring boot, JavaScript...

## 목표
- OAuth, JWT를 통한 사용자 인증 구현
- Spring Data JPA 적용
- 기한: 2022-05-12 ~ 2022-05-22 💪

## 타임 라인
<details>
<summary>Day1 - 초기 프로젝트 생성 및 소셜 로그인 기능 구현</summary>

- 학습 정리 링크  
  https://battle-baron-32c.notion.site/f1a0697a40b84d078d630724b5ae6542

- 작업 내역
    - [x] 초기 스프링 부트 프로젝트 생성
    - [x] 초기 로그인 화면 생성
    - [x] authorization code 정상 수신 확인
    - [x] access token 정상 수신 확인
    - [x] access token 을 활용해 사용자 정보 읽어오기
    - [ ] 테스트 코드 작성

- 회고
  - 생각보다 OAuth 공부에 시간이 많이 소요되어, 사용자 인증을 완성하지 못했다...ㅠㅠ
  - 내일 오전에 조금 일찍 일어나, JWT와 refresh token 구현부분을 완성하고 Response 까지 마무리 하는 것이 목표이다!

- 참고 자료
    - https://velog.io/@max9106/OAuth4

</details>

<details>
<summary>Day2, 3 - Spring Security 전환 및 JWT 적용, 일반 로그인 기능 추가 </summary>

- 학습 정리 링크  
    - https://battle-baron-32c.notion.site/Spring-Security-JWT-a3ca7b1f8f7b4ba7a29a598f0742568c
- 작업 내역
  - 구현하지 못했다.. ㅠㅠ 

- 회고
  - Spring Security + OAuth2 + JWT를 통합하여 구현하려다 보니 갈피를 잡는게 쉽지 않았다...  
    우선 Spring Securiy + JWT 부터 차근차근 다시 도전해봐야겠다!!

- 참고 자료
  - https://github.com/deepIify/oauth-login-be
  - https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-jwt#

</details>
