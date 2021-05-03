# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록
### 게임 규칙
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
  → 횟수가 주어진다 , n대의 자동차, 전진 또는 멈춤
* 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
  → 자동차에 이름부여, 이름을 출력
* 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
  → 이름은 쉼표로 구분, 5자 이하만 가능
* 사용자는 몇번의 이동을 할 것인지를 입력할 수 있어야 한다.
  → 몇번 이동할지 정한다.
* 전진하는 조건은 0에서 9사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
  → 0 ~ 9 사이 랜덤한 숫자 생성, 4이상 전진, 3이하 멈춤 
* 다옹차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
  → 주어진 횟수만큼 이동한 후, 누가 우승했는지 알려준다, 우승자는 한 명 이상일 수 있다.
  
---
### 규칙에 따른 상세 기능 정의
* n대의 자동차 정의 → 입력하는 자동차의 이름 갯수
* 자동차의 이름 입력. 쉼표로 구분. 이름은 5자 이하만 가능
* 자동차를 움직이는 횟수 입력
* 0~9 사이의 random 값을 생성. 4이상이면 전진, 3이하면 멈춤. 각각의 자동차에 대해 생성해야 함.
* 주어진 횟수 만큼 이동하면 가장 많이 간 자동차를 찾는다.

---
### 구현 목록
- 자동차  
[X] 자동차 객체 생성.  
[X] 자동차의 이름은 5자 이하이도록 개발.  
[X] 자동차의 이름은 , 로 구분되도록 개발.  
[X] 자동차가 이름을 갖도록 개발.  
[X] 자동차들을 가지는 객체 생성.  
[X] 자동차가 위치값을 가지도록 생성.  
[X] 자동차가 랜덤값 결과에 따라 앞으로 가거나 멈추는 기능 생성.  

- 기어  
[x] random 값 생성 및 검증.     
[X] random 값이 4이상이면 전진, 3이하면 멈추는 로직 생성.  
[X] random 값에 따라 자동차가 움직이는 기능 생성.  
  
- 결과  
[ ] 결과값 객체 생성.  
  
- 사용자 입력  
[ ] 사용자 입력 값 받기.  
[X] 사용자가 입력한 회수와 자동차들 이름을 저장하는 객체 생성.
  
