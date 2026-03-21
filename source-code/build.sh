wget https://dl.google.com/android/repository/commandlinetools-linux-14742923_latest.zip -o commandlinetools-linux.zip
unzip commandlinetools.zip
./cmdline-tools/bin/sdkmanager "platform-tools" "platforms;android-36" "build-tools;36.0.0" --sdk_root=./android-build-tools
./android-build-tools/build-tools/36.0.0/aapt2
