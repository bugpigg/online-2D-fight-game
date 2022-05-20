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
<summary>Day 1 - 초기 프로젝트 생성 및 소셜 로그인 기능 구현</summary>

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
<summary>Day 2, 3 - Spring Security 전환 및 JWT 적용, 일반 로그인 기능 추가 </summary>

- 학습 정리 링크  
    - https://battle-baron-32c.notion.site/Spring-Security-JWT-a3ca7b1f8f7b4ba7a29a598f0742568c
- 작업 내역
  - 구현하지 못했다.. ㅠㅠ 

- 회고
  - Spring Security + OAuth2 + JWT 를 통합하여 구현하려다 보니 갈피를 잡는게 쉽지 않았다...  
    우선 Spring Security + JWT 부터 차근차근 다시 도전해봐야겠다!!

- 참고 자료
  - https://github.com/deepIify/oauth-login-be
  - https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-jwt#

</details>

<details>
<summary>Day 4, 5 - Spring Security + JWT 로그인 기능 마무리  </summary>

- 학습 정리 링크
  - https://battle-baron-32c.notion.site/Spring-Security-JWT-d6f3776e48cc4e2585b13b6923b36109

- 작업 내역
  - [x] 로그인 페이지 및 기능 구현
    ![image](https://user-images.githubusercontent.com/91416897/168760818-a92e1e2a-9517-4e6b-a435-928b6be278cd.png)
  - [x] 회원가입 페이지 및 기능 구현
    ![image](https://user-images.githubusercontent.com/91416897/168760938-f90647c5-d966-46dd-8019-b64f7014fb2d.png)
  - [x] accessToken 은 로컬 스토리지에 저장하고, refreshToken 은 쿠키에 저장하도록 설정
  - [ ] 자세한 예외 처리
  
- 회고
  - 다른 분들의 블로그 글과 코드를 많이 참조하여 구현했다. 추후에 리팩토링이 필요하다!!
  - Spring Security 너무 어려웠지만 아주 조금 익숙해졌다 ㅎㅎ

- 참고 자료
  - 백엔드 구현
    - https://github.com/deepIify/oauth-login-be
    - https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-jwt#
    - https://github.com/ParkJiwoon/practice-codes
  - 프론트 구현
    - 로그인 페이지 html, css
      - https://bootsnipp.com/snippets/vl4R7
    - background image
      - unsplash from [Ria](https://unsplash.com/photos/oZzoDW61aoM)
</details>

<details>
<summary>Day 6, 7 - 대기실 기능 구현  </summary>

- 작업 내역
  - BE
    - [x]  대기실에 입장하면 username 반환하는 API 생성
    - [x]  검증 로직 수정  
      DB가 초기화 된 후에도 로컬 저장소에 access Token이 남아 있으면 유효한 Request로 처리함..  
      이는 아마 검증과정에서 access Token 의 유효성만 검증하기 때문  
      -> RefreshToken 검증과정 추가
    - [ ] 접속 중인 유저 리스트 불러오기
  - FE
    - [x]  대기실 리스트 템플릿 만들기
    - [x]  대기실 생성 버튼 만들기
    - [x]  스크롤바 커스텀하기
      ![image](https://user-images.githubusercontent.com/91416897/169096021-b3c94a14-6cf7-49ac-93bf-933604826f43.png)

- 참고 자료
  - html a link 무지개 hover 효과  
    https://medium.com/guleum/css-%EB%A7%81%ED%81%AC-hover%EC%8B%9C-%EB%AC%B4%EC%A7%80%EA%B0%9C-%ED%9A%A8%EA%B3%BC-css3%EB%A1%9C-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0-8981fcb4fbf3

  - 스크롤바 커스텀  
    https://jh91.tistory.com/entry/css-%EC%8A%A4%ED%81%AC%EB%A1%A4%EB%B0%94-%EC%BB%A4%EC%8A%A4%ED%85%80
</details>

<details>
<summary>Day 8, 9 - 대기실 기능 구현 마무리 및 WebSocket 적용 </summary>

- 작업 내역
  - BE

  - FE

- 참고 자료

</details>
  

  

