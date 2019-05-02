# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple bridge between ROS 1 and ROS 2"
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BPN = "ros1_bridge"

ROS_BUILD_DEPENDS = " \
    actionlib-msgs \
    builtin-interfaces \
    diagnostic-msgs \
    example-interfaces \
    geometry-msgs \
    nav-msgs \
    pkgconfig \
    python3-pyyaml \
    rclcpp \
    rcutils \
    rmw-implementation-cmake \
    rosgraph-msgs \
    sensor-msgs \
    shape-msgs \
    std-msgs \
    std-srvs \
    stereo-msgs \
    tf2-msgs \
    trajectory-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-index-python-native \
    python3-catkin-pkg-native \
    rosidl-cmake-native \
    rosidl-parser-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib-msgs \
    diagnostic-msgs \
    example-interfaces \
    geometry-msgs \
    nav-msgs \
    rosgraph-msgs \
    sensor-msgs \
    shape-msgs \
    std-srvs \
    stereo-msgs \
    tf2-msgs \
    trajectory-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    builtin-interfaces \
    diagnostic-msgs \
    example-interfaces \
    geometry-msgs \
    nav-msgs \
    python3-pyyaml \
    rclcpp \
    rcutils \
    rosgraph-msgs \
    sensor-msgs \
    shape-msgs \
    std-msgs \
    std-srvs \
    stereo-msgs \
    tf2-msgs \
    trajectory-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    demo-nodes-cpp \
    diagnostic-msgs \
    launch \
    ros2run \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/ros1_bridge-release/archive/release/bouncy/ros1_bridge/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "533535bf72d793546b7e6b224b638d51"
SRC_URI[sha256sum] = "8475f6e0edd96ba2cd42bd0f2ecadece1c13a86dd2d3a9975483dd4f63fa9ff4"
S = "${WORKDIR}/ros1_bridge-release-release-bouncy-ros1_bridge-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ros1-bridge/ros1-bridge_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ros1-bridge/ros1-bridge_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros1-bridge/ros1-bridge-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros1-bridge/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros1-bridge/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
