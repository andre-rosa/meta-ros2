# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ nodes which were previously in the ros2/examples repository but are now just used for demo purposes."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BPN = "demo_nodes_cpp"

ROS_BUILD_DEPENDS = " \
    example-interfaces \
    rclcpp \
    rcutils \
    rmw-implementation-cmake \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    example-interfaces \
    launch-ros \
    rclcpp \
    rcutils \
    rmw-implementation \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-testing \
    rclcpp \
    rmw-implementation \
    rosidl-default-generators \
    rosidl-default-runtime \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/demo_nodes_cpp/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d16c7e19f82334ace755d538972bbbb5"
SRC_URI[sha256sum] = "7116757463ab67d26ae55e324fa7705aaf4f898c0a1d9b7012c1301737832b12"
S = "${WORKDIR}/demos-release-release-bouncy-demo_nodes_cpp-0.5.1-1"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/demos/demos_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/demos/demos_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/demos-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
