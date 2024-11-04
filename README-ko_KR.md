# Zombies 모드를 위한 Zombies Tools v1.0.0이 포함된 Essential Loom 기반 템플릿

언어: [English (US)](README.md), [한국어 (대한민국)](README-ko_KR.md)

**다른 템플릿의 경우 [이 저장소의 다른 브랜치](https://github.com/romangraef/Forge1.8.9Template/branches/all)를 확인하세요.**

## 사용법

레거시 모딩에 대한 전체 튜토리얼은 https://moddev.nea.moe/ 에서 확인하세요.

시작하려면 [이 템플릿을 사용하세요](https://github.com/new?template_name=Forge1.8.9Template&template_owner=nea89o).

> [!경고]
> 이 템플릿을 포크, 복제 또는 다운로드하지 마세요. 이 템플릿을 "사용"하면 사용자 지정 모드 ID가 생성됩니다. Linux를 사용하는 경우 `make-my-own` 스크립트를 사용하여 수동으로 수행할 수 있습니다. Linux가 이닌 경우 이 템플릿 사용 버튼을 클릭하세요. Kotlin을 사용하려면 "Include all branches"을 체크하고 https://github.com/yourname/yourreponame/settings 에서 기본 브랜치를 변경하세요.

이 프로젝트는 기본적으로 [DevAuth](https://github.com/DJtheRedstoner/DevAuth)를 사용하므로 실제 마인크래프트 계정을 사용하여 로그인할 수 있습니다. 필요하지 않으면 빌드 스크립트에서 제거할 수 있습니다.

모드를 실행하려면 두 개의 JDK가 필요합니다. 하나는 Java 17 jdk이고 다른 하나는 Java 1.8 jdk입니다.
[여기](https://adoptium.net/temurin/releases)에서 다운로드할 수 있습니다(또는 직접 다운로드한 것을 사용하세요).

프로젝트를 IntelliJ로 가져올 때 gradle 탭에서 gradle jvm을 Java 17 JDK로 설정하고 Project SDK를 Java 1.8 JDK로 설정해야 합니다.
그런 다음 IntelliJ에서 동기화 버튼을 클릭하면 `Minecraft Client`라는 실행 작업이 생성됩니다. 그렇지 않으면 IntelliJ를 다시 시작해 보세요.
**Mac 사용자를 위한 경고**: 실행 구성에서 `-XStartOnFirstThread` vm 인수를 제거해야 할 수도 있습니다. 앞으로는 플러그인에서 처리해야 하지만 지금은 수동으로 해야 할 것입니다.

프로젝트를 내보내려면 `gradle build` 작업을 실행하고 다른 사람들에게 `build/libs/<modid>-<version>.jar` 파일을 제공합니다.
`build/badjars` 폴더의 jar 파일은 무시합니다. 이는 빌드 시스템에서 사용하지만 일반 forge 설치에서는 *작동하지 않는* 중간 jar 파일입니다.

Mixin(바닐라 코드를 수정하는 라이브러리)을 원하지 않으면 `build.gradle.kts`에서 주석과 `com.example.mixin` 패키지로 지정된 줄에서 믹스인에 대한 참조를 제거할 수 있습니다.

access transformers(메서드를 공개/비최종으로 만들 수 있음)를 원하지 않는 경우 `accesstransformer.cfg` 파일을 삭제할 수 있습니다.
`accesstransformers.cfg`를 변경하는 경우 `./gradlew build --refresh-dependencies`를 사용하여 프로젝트를 다시 빌드해야 할 수 있습니다.

### 동영상으로 보기

[![Youtube Tutorial](https://i.ytimg.com/vi/nWzHlomdCgc/maxresdefault.jpg)](https://www.youtube.com/watch?v=nWzHlomdCgc)

## 라이선스
이 프로젝트는 [LICENSE](LICENSE) 파일의 전문에 따라 MIT 허가서가 적용됩니다.<br>
라이선스 및 저작권 고지 하에 개인적 이용, 수정, 배포, 상업적 이용이 가능하며, 어떠한 보증이나 책임도 없습니다.

# 아래 내용을 삭제하지 마십시오.
프로젝트의 중요한 부분(예: README.md)에 다음 내용을 어떤 형태로든 포함해야 합니다. 그러나 원하는 경우 "Forge1.8.9Template" 부분을 제거할 수 있습니다.<br>
일부 라이브러리가 사용되지 않는 경우 Credits에서 해당 부분을 제거하십시오.

## Credits
- architectury의 [Architectury Pack200](https://github.com/architectury/architectury-pack200) ([Classpath Exception을 포함한 GNU 일반 공중 사용 허가서 v2.0](https://github.com/architectury/architectury-pack200/blob/master/LICENSE))
- DJtheRedstoner의 [DevAuth](https://github.com/DJtheRedstoner/DevAuth) ([MIT 허가서](https://github.com/DJtheRedstoner/DevAuth/blob/master/LICENSE))
- EssentialGG의 [Essential Loom](https://github.com/EssentialGG/architectury-loom) ([MIT 허가서](https://github.com/EssentialGG/architectury-loom/blob/dev/1.6/LICENSE))
- nea89o의 [Forge1.8.9Template](https://github.com/nea89o/Forge1.8.9Template) ([The Unlicense](https://github.com/nea89o/Forge1.8.9Template/blob/master/LICENSE))
- SpongePowered의 [Mixin](https://github.com/SpongePowered/Mixin) ([MIT 허가서](https://github.com/SpongePowered/Mixin/blob/master/LICENSE.txt))
- hahaha98757의 [Zombies Mod Template](https://github.com/hahaha98757/zombies-mod-template) ([MIT 허가서](https://github.com/hahaha98757/zombies-mod-template/blob/master/LICENSE))
- hahaha98757의 [Zombies Tools](https://github.com/hahaha98757/zombies-tools) ([MIT 허가서](https://github.com/hahaha98757/zombies-tools/blob/master/LICENSE))