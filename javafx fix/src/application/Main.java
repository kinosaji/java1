//Eclipse 환경에서 JavaFX 사용하기 (JDK11 버전 이후)

//오류원인
//JDK11 버전부터 javafx가 따로 떨어져 있어서 
//추가로 javafx의 jdk를 다운로드해야함



//@@@@@ one step @@@@@//
//jdk 파일 다운로드 >> https://openjfx.io/
//window-preferenses-User libraries에 다운받은 jdk 추가 (lib폴더안에있는거 모두열면됨)
//프로젝트명에 우클릭 build path-add libraries-user library 앞서 만든 라이브러리 추가


//@@@@@ two step @@@@@//
//run icon 초이스박스 - run configuration - Arguments
//Vm arguments 에 --module-path "본인 javafx의 lib폴더까지의경로" --add-modules=javafx.fxml,javafx.controls
//경로설정중 띄어쓰기안하도록주의!
//실행



//참조사이트 https://luminitworld.tistory.com/44