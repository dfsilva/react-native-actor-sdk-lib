
# react-native-actor-sdk-lib

## Getting started

`$ npm install react-native-actor-sdk-lib --save`

### Mostly automatic installation

`$ react-native link react-native-actor-sdk-lib`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-actor-sdk-lib` and add `RNActorSdkLib.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNActorSdkLib.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNActorSdkLibPackage;` to the imports at the top of the file
  - Add `new RNActorSdkLibPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-actor-sdk-lib'
  	project(':react-native-actor-sdk-lib').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-actor-sdk-lib/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-actor-sdk-lib')
  	```


## Usage
```javascript
import RNActorSdkLib from 'react-native-actor-sdk-lib';

// TODO: What to do with the module?
RNActorSdkLib;
```
  