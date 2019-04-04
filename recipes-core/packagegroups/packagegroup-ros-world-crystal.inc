# Copyright (c) 2019 LG Electronics, Inc.

# Can't build these until we figure out how to build clang-format without building all of clang.
RDEPENDS_${PN}_remove = "ament-clang-format"
RDEPENDS_${PN}_remove = "ament-cmake-clang-format"

# Not used by "crystal"; this allows us to defer fixing log4cxx v0.10.0-13 until working on "melodic".
RDEPENDS_${PN}_remove = "rcl-logging-log4cxx"

# OE won't let us build ffmpeg unless LICENSE_FLAGS_WHITELIST contains "commerical".
RDEPENDS_${PN}_remove = "${@bb.utils.contains('LICENSE_FLAGS_WHITELIST', 'commercial', '', 'ffmpeg', d)}"

# behaviortree-cpp-v3 and navigation2 are mutually exclusive because several of its packages depend on behaviortree-cpp.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'behaviortree-cpp', 'behaviortree-cpp-v3', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'costmap-queue', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'dwb-controller', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'dwb-core', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'dwb-critics', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'dwb-msgs', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'dwb-plugins', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav-2d-msgs', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav-2d-utils', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-amcl', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-bringup', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-bt-navigator', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-common', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-costmap-2d', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-dwb-controller', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-dynamic-params', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-map-server', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-mission-executor', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-motion-primitives', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-msgs', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-navfn-planner', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-robot', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-simple-navigator', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-tasks', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-util', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-voxel-grid', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'nav2-world-model', '', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'navigation2', '', d)}"

# desktop RDEPENDS on rviz packages.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-desktop ros-rviz', '', 'desktop', d)}"

# NB. gazebo-msgs is a dependency of non-Gazebo packages, so it doesn't appear here.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'gazebo-rosdev', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'gazebo-plugins', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'gazebo-ros', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-gazebo', '', 'gazebo-ros-pkgs', d)}"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-realsense', '', 'librealsense2', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-realsense', '', 'realsense-camera-msgs', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-realsense', '', 'realsense-ros2-camera', d)}"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'python-qt-binding', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'qt-dotgraph', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'qt-gui', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'qt-gui-app', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'qt-gui-core', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'qt-gui-cpp', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-qt', '', 'qt-gui-py-common', d)}"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-action', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-console', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-graph', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-gui', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-gui-cpp', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-gui-py', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-image-view', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-msg', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-plot', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-publisher', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-py-common', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-py-console', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-service-caller', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-shell', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-srv', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-top', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rqt ros-qt', '', 'rqt-topic', d)}"

# RViz requires the "opengl" distro feature.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'object-analytics-rviz', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-assimp-vendor', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-common', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-default-plugins', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-ogre-vendor', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-rendering', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-rendering', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-rendering-tests', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz-visual-testing-framework', d)}"
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-rviz opengl', '', 'rviz2', d)}"
