# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "All packages listed in ${ROS_DISTRO}-cache.yaml"
LICENSE = "MIT"

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = " \
    actionlib-msgs \
    amcl \
    ament-clang-format \
    ament-cmake \
    ament-cmake-auto \
    ament-cmake-clang-format \
    ament-cmake-copyright \
    ament-cmake-core \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-export-definitions \
    ament-cmake-export-dependencies \
    ament-cmake-export-include-directories \
    ament-cmake-export-interfaces \
    ament-cmake-export-libraries \
    ament-cmake-export-link-flags \
    ament-cmake-flake8 \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-include-directories \
    ament-cmake-libraries \
    ament-cmake-lint-cmake \
    ament-cmake-nose \
    ament-cmake-pclint \
    ament-cmake-pep257 \
    ament-cmake-pep8 \
    ament-cmake-pyflakes \
    ament-cmake-pytest \
    ament-cmake-python \
    ament-cmake-ros \
    ament-cmake-target-dependencies \
    ament-cmake-test \
    ament-cmake-uncrustify \
    ament-copyright \
    ament-cppcheck \
    ament-cpplint \
    ament-flake8 \
    ament-index-cpp \
    ament-index-python \
    ament-lint-auto \
    ament-lint-cmake \
    ament-lint-common \
    ament-package \
    ament-pclint \
    ament-pep257 \
    ament-pep8 \
    ament-pyflakes \
    ament-tools \
    ament-uncrustify \
    angles \
    astra-camera \
    builtin-interfaces \
    cartographer \
    cartographer-ros \
    cartographer-ros-msgs \
    class-loader \
    common-interfaces \
    composition \
    control-msgs \
    cv-bridge \
    demo-nodes-cpp \
    demo-nodes-cpp-rosnative \
    demo-nodes-py \
    depthimage-to-laserscan \
    depthimage-to-pointcloud2 \
    desktop \
    diagnostic-msgs \
    dummy-map-server \
    dummy-robot-bringup \
    dummy-sensors \
    ecl-build \
    ecl-command-line \
    ecl-concepts \
    ecl-config \
    ecl-console \
    ecl-containers \
    ecl-converters \
    ecl-converters-lite \
    ecl-core-apps \
    ecl-devices \
    ecl-eigen \
    ecl-errors \
    ecl-exceptions \
    ecl-filesystem \
    ecl-formatters \
    ecl-geometry \
    ecl-io \
    ecl-ipc \
    ecl-license \
    ecl-linear-algebra \
    ecl-manipulators \
    ecl-math \
    ecl-mobile-robot \
    ecl-mpl \
    ecl-sigslots \
    ecl-sigslots-lite \
    ecl-statistics \
    ecl-streams \
    ecl-threads \
    ecl-time \
    ecl-time-lite \
    ecl-type-traits \
    ecl-utilities \
    example-interfaces \
    examples-rclcpp-minimal-client \
    examples-rclcpp-minimal-composition \
    examples-rclcpp-minimal-publisher \
    examples-rclcpp-minimal-service \
    examples-rclcpp-minimal-subscriber \
    examples-rclcpp-minimal-timer \
    examples-rclpy-executors \
    examples-rclpy-minimal-client \
    examples-rclpy-minimal-publisher \
    examples-rclpy-minimal-service \
    examples-rclpy-minimal-subscriber \
    fastcdr \
    fastrtps \
    fastrtps-cmake-module \
    geometry-msgs \
    gmock-vendor \
    gtest-vendor \
    image-geometry \
    image-tools \
    intra-process-demo \
    joy \
    kdl-parser \
    laser-geometry \
    launch \
    launch-ros \
    launch-testing \
    libcurl-vendor \
    lifecycle \
    lifecycle-msgs \
    logging-demo \
    map-msgs \
    map-server \
    nav-msgs \
    orocos-kdl \
    osrf-pycommon \
    osrf-testing-tools-cpp \
    pcl-conversions \
    pendulum-control \
    pendulum-msgs \
    pluginlib \
    poco-vendor \
    py-trees \
    py-trees-msgs \
    python-cmake-module \
    rcl \
    rcl-interfaces \
    rcl-lifecycle \
    rcl-yaml-param-parser \
    rclcpp \
    rclcpp-lifecycle \
    rclpy \
    rcutils \
    resource-retriever \
    rmw \
    rmw-fastrtps-cpp \
    rmw-implementation \
    rmw-implementation-cmake \
    robot-state-publisher \
    ros-base \
    ros-core \
    ros-environment \
    ros-workspace \
    ros1-bridge \
    ros2cli \
    ros2launch \
    ros2lifecycle \
    ros2msg \
    ros2node \
    ros2param \
    ros2pkg \
    ros2run \
    ros2service \
    ros2srv \
    ros2topic \
    rosgraph-msgs \
    rosidl-cmake \
    rosidl-default-generators \
    rosidl-default-runtime \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-generator-dds-idl \
    rosidl-generator-py \
    rosidl-parser \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
    rosidl-typesupport-interface \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
    rttest \
    rviz-assimp-vendor \
    rviz-common \
    rviz-default-plugins \
    rviz-ogre-vendor \
    rviz-rendering \
    rviz-rendering-tests \
    rviz-visual-testing-framework \
    rviz-yaml-cpp-vendor \
    rviz2 \
    sensor-msgs \
    shape-msgs \
    sophus \
    sros2 \
    std-msgs \
    std-srvs \
    stereo-msgs \
    teleop-twist-joy \
    teleop-twist-keyboard \
    test-msgs \
    test-osrf-testing-tools-cpp \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-msgs \
    tf2-ros \
    tinyxml-vendor \
    tinyxml2-vendor \
    tlsf \
    tlsf-cpp \
    topic-monitor \
    trajectory-msgs \
    turtlebot2-amcl \
    turtlebot2-cartographer \
    turtlebot2-demo \
    turtlebot2-drivers \
    turtlebot2-follower \
    turtlebot2-teleop \
    uncrustify-vendor \
    urdf \
    vision-opencv \
    visualization-msgs \
"
