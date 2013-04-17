Practice Report for 1.4
------

実習のレポートを下記に記述してください

1. (実習)Android SDK 内の、下記の 2 つのディレクトリにあるコマンドを列挙してください。
 1. sdk/tools/
android
apkbuilder
ddms
dmtracedump
draw9patch
emulator
emulator-arm
emulator-mips
emulator-x86
emulator64-arm
emulator64-mips
emulator64-x86
etc1tool
hierarchyviewer
hprof-conv
jobb
lint
mksdcard
monitor
monkeyrunner
sqlite3
traceview
uiautomatorviewer
zipalign
 2. sdk/platform-tooks
aapt
adb
aidl
dexdump
dx
fastboot
llvm-rs-cc

2. (実習)上記のディレクトリにパスを通し、下記のコマンドを実行してください。
 - adb devices
[koya.tamura@90200989n] % ./adb devices     [/Applications/adt-bundle-mac-x86_64-20130219/sdk/platform-tools]
List of devices attached
353025041580556 device

 - adb shell
$

3. (実習)adb shellコマンドを使って、Android 内のファイルシステムにアクセスし、下記の項目を確認してください。
$ ls
opendir failed, Permission denied
