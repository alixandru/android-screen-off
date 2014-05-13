# Screen Off

## Overview
An Android application that turns screen off and locks the device upon request and when initiating/answering a call.
Useful when the proximity sensor is disabled or when the device has no proximity sensor.


## Features
1. When application is launched, it turns screen off without any delay. It also provides a feedback in the form of a short vibration.
2. When a call is initiated, it turns screen off after 1200 ms, without any vibration feedback.
3. When a call is answered, it turns screen off after 400 ms, without any vibration feedback.

Once screen is off, the device is also locked.


#### Configuration
After installation, this application must be manually marked as Device Administrator from the device's Security settings in order to able to lock your device. If this step is not performed, the screen will not turn off and instead, a notification message will be displayed. 
No further configuration or setup is needed after this step.


## Development
This project is built using Android Developer Tools. If you want to modify the code, please use Android Developer Tools suite.


## License
This project is released under the terms of the MIT License. You are free to use the source code of this project in any other project (even commercial projects) as long as the copyright header is left intact.
