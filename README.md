<h1 align="center">
    <p>online-2D-fight-game</p>
</h1>

๐ฎ make simple online 2D fight game with Spring boot, JavaScript...

## ๋ชฉํ
- OAuth, JWT๋ฅผ ํตํ ์ฌ์ฉ์ ์ธ์ฆ ๊ตฌํ
- Spring Data JPA ์ ์ฉ
- ๊ธฐํ: 2022-05-12 ~ 2022-05-22 ๐ช

## ํ์ ๋ผ์ธ
<details>
<summary>Day 1 - ์ด๊ธฐ ํ๋ก์ ํธ ์์ฑ ๋ฐ ์์ ๋ก๊ทธ์ธ ๊ธฐ๋ฅ ๊ตฌํ</summary>

- ํ์ต ์ ๋ฆฌ ๋งํฌ  
  https://battle-baron-32c.notion.site/f1a0697a40b84d078d630724b5ae6542

- ์์ ๋ด์ญ
    - [x] ์ด๊ธฐ ์คํ๋ง ๋ถํธ ํ๋ก์ ํธ ์์ฑ
    - [x] ์ด๊ธฐ ๋ก๊ทธ์ธ ํ๋ฉด ์์ฑ
    - [x] authorization code ์ ์ ์์  ํ์ธ
    - [x] access token ์ ์ ์์  ํ์ธ
    - [x] access token ์ ํ์ฉํด ์ฌ์ฉ์ ์ ๋ณด ์ฝ์ด์ค๊ธฐ
    - [ ] ํ์คํธ ์ฝ๋ ์์ฑ

- ํ๊ณ 
  - ์๊ฐ๋ณด๋ค OAuth ๊ณต๋ถ์ ์๊ฐ์ด ๋ง์ด ์์๋์ด, ์ฌ์ฉ์ ์ธ์ฆ์ ์์ฑํ์ง ๋ชปํ๋ค...ใ ใ 
  - ๋ด์ผ ์ค์ ์ ์กฐ๊ธ ์ผ์ฐ ์ผ์ด๋, JWT์ refresh token ๊ตฌํ๋ถ๋ถ์ ์์ฑํ๊ณ  Response ๊น์ง ๋ง๋ฌด๋ฆฌ ํ๋ ๊ฒ์ด ๋ชฉํ์ด๋ค!

- ์ฐธ๊ณ  ์๋ฃ
    - https://velog.io/@max9106/OAuth4

</details>

<details>
<summary>Day 2, 3 - Spring Security ์ ํ ๋ฐ JWT ์ ์ฉ, ์ผ๋ฐ ๋ก๊ทธ์ธ ๊ธฐ๋ฅ ์ถ๊ฐ </summary>

- ํ์ต ์ ๋ฆฌ ๋งํฌ  
    - https://battle-baron-32c.notion.site/Spring-Security-JWT-a3ca7b1f8f7b4ba7a29a598f0742568c
- ์์ ๋ด์ญ
  - ๊ตฌํํ์ง ๋ชปํ๋ค.. ใ ใ  

- ํ๊ณ 
  - Spring Security + OAuth2 + JWT ๋ฅผ ํตํฉํ์ฌ ๊ตฌํํ๋ ค๋ค ๋ณด๋ ๊ฐํผ๋ฅผ ์ก๋๊ฒ ์ฝ์ง ์์๋ค...  
    ์ฐ์  Spring Security + JWT ๋ถํฐ ์ฐจ๊ทผ์ฐจ๊ทผ ๋ค์ ๋์ ํด๋ด์ผ๊ฒ ๋ค!!

- ์ฐธ๊ณ  ์๋ฃ
  - https://github.com/deepIify/oauth-login-be
  - https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-jwt#

</details>

<details>
<summary>Day 4, 5 - Spring Security + JWT ๋ก๊ทธ์ธ ๊ธฐ๋ฅ ๋ง๋ฌด๋ฆฌ  </summary>

- ํ์ต ์ ๋ฆฌ ๋งํฌ
  - https://battle-baron-32c.notion.site/Spring-Security-JWT-d6f3776e48cc4e2585b13b6923b36109

- ์์ ๋ด์ญ
  - [x] ๋ก๊ทธ์ธ ํ์ด์ง ๋ฐ ๊ธฐ๋ฅ ๊ตฌํ
    ![image](https://user-images.githubusercontent.com/91416897/168760818-a92e1e2a-9517-4e6b-a435-928b6be278cd.png)
  - [x] ํ์๊ฐ์ ํ์ด์ง ๋ฐ ๊ธฐ๋ฅ ๊ตฌํ
    ![image](https://user-images.githubusercontent.com/91416897/168760938-f90647c5-d966-46dd-8019-b64f7014fb2d.png)
  - [x] accessToken ์ ๋ก์ปฌ ์คํ ๋ฆฌ์ง์ ์ ์ฅํ๊ณ , refreshToken ์ ์ฟ ํค์ ์ ์ฅํ๋๋ก ์ค์ 
  - [ ] ์์ธํ ์์ธ ์ฒ๋ฆฌ
  
- ํ๊ณ 
  - ๋ค๋ฅธ ๋ถ๋ค์ ๋ธ๋ก๊ทธ ๊ธ๊ณผ ์ฝ๋๋ฅผ ๋ง์ด ์ฐธ์กฐํ์ฌ ๊ตฌํํ๋ค. ์ถํ์ ๋ฆฌํฉํ ๋ง์ด ํ์ํ๋ค!!
  - Spring Security ๋๋ฌด ์ด๋ ค์ ์ง๋ง ์์ฃผ ์กฐ๊ธ ์ต์ํด์ก๋ค ใใ

- ์ฐธ๊ณ  ์๋ฃ
  - ๋ฐฑ์๋ ๊ตฌํ
    - https://github.com/deepIify/oauth-login-be
    - https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-jwt#
    - https://github.com/ParkJiwoon/practice-codes
  - ํ๋ก ํธ ๊ตฌํ
    - ๋ก๊ทธ์ธ ํ์ด์ง html, css
      - https://bootsnipp.com/snippets/vl4R7
    - background image
      - unsplash from [Ria](https://unsplash.com/photos/oZzoDW61aoM)
</details>

<details>
<summary>Day 6, 7 - ๋๊ธฐ์ค ๊ธฐ๋ฅ ๊ตฌํ  </summary>

- ์์ ๋ด์ญ
  - BE
    - [x]  ๋๊ธฐ์ค์ ์์ฅํ๋ฉด username ๋ฐํํ๋ API ์์ฑ
    - [x]  ๊ฒ์ฆ ๋ก์ง ์์   
      DB๊ฐ ์ด๊ธฐํ ๋ ํ์๋ ๋ก์ปฌ ์ ์ฅ์์ access Token์ด ๋จ์ ์์ผ๋ฉด ์ ํจํ Request๋ก ์ฒ๋ฆฌํจ..  
      ์ด๋ ์๋ง ๊ฒ์ฆ๊ณผ์ ์์ access Token ์ ์ ํจ์ฑ๋ง ๊ฒ์ฆํ๊ธฐ ๋๋ฌธ  
      -> RefreshToken ๊ฒ์ฆ๊ณผ์  ์ถ๊ฐ
    - [ ] ์ ์ ์ค์ธ ์ ์  ๋ฆฌ์คํธ ๋ถ๋ฌ์ค๊ธฐ
  - FE
    - [x]  ๋๊ธฐ์ค ๋ฆฌ์คํธ ํํ๋ฆฟ ๋ง๋ค๊ธฐ
    - [x]  ๋๊ธฐ์ค ์์ฑ ๋ฒํผ ๋ง๋ค๊ธฐ
    - [x]  ์คํฌ๋กค๋ฐ ์ปค์คํํ๊ธฐ
      ![image](https://user-images.githubusercontent.com/91416897/169096021-b3c94a14-6cf7-49ac-93bf-933604826f43.png)

- ์ฐธ๊ณ  ์๋ฃ
  - html a link ๋ฌด์ง๊ฐ hover ํจ๊ณผ  
    https://medium.com/guleum/css-%EB%A7%81%ED%81%AC-hover%EC%8B%9C-%EB%AC%B4%EC%A7%80%EA%B0%9C-%ED%9A%A8%EA%B3%BC-css3%EB%A1%9C-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0-8981fcb4fbf3

  - ์คํฌ๋กค๋ฐ ์ปค์คํ  
    https://jh91.tistory.com/entry/css-%EC%8A%A4%ED%81%AC%EB%A1%A4%EB%B0%94-%EC%BB%A4%EC%8A%A4%ED%85%80
</details>
