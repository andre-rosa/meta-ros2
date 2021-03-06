# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples for composing multiple nodes in a single process."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    class-loader \
    example-interfaces \
    rclcpp \
    rcutils \
    rosidl-cmake \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-cpp \
    class-loader \
    example-interfaces \
    rclcpp \
    rcutils \
    rosidl-default-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-testing \
    rmw-implementation-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/composition/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a13bd4b0d2b27f8c7b04ef6dfe6c0a47"
SRC_URI[sha256sum] = "b5f5af7a8107b1f7d3c133bbf6bc2423714c04fb7e0dc5791c0bbc2335deffb0"
S = "${WORKDIR}/demos-release-release-bouncy-composition-0.5.1-1"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/demos/demos_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/demos/demos_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/demos-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
