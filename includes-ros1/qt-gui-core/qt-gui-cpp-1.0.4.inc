# Copyright (c) 2019 LG Electronics, Inc.

inherit cmake_qt5

ROS_BUILD_DEPENDS_append = " python3-pyqt5"
ROS_BUILDTOOL_DEPENDS_append = " sip3-native"
