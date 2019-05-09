# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This contains CvBridge, which converts between ROS2     Image messages and OpenCV images."
AUTHOR = "Ethan Gao <ethan.gao@linux.intel.com>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://www.ros.org/wiki/cv_bridge"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "vision_opencv"
ROS_BPN = "cv_bridge"

ROS_BUILD_DEPENDS = " \
    boost \
    opencv \
    python3-numpy \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
    python-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    opencv \
    python3-numpy \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    boost \
    opencv \
    python3-numpy \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    opencv \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/bouncy/cv_bridge/2.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3367ac0b470d8625a70fa17201f6ded2"
SRC_URI[sha256sum] = "a2ec0f5b7b3b3c966c0fbc7c488922b15d7f931961350be9d1bbe105e54d27e3"
S = "${WORKDIR}/vision_opencv-release-release-bouncy-cv_bridge-2.0.5-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('vision-opencv', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('vision-opencv', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/vision-opencv/vision-opencv_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/vision-opencv/vision-opencv-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/vision-opencv/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/vision-opencv/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
