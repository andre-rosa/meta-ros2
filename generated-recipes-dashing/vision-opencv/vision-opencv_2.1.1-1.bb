# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Packages for interfacing ROS2 with OpenCV, a library of programming functions for real time computer vision."
AUTHOR = "Ethan Gao <ethan.gao@linux.intel.com>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://www.ros.org/wiki/vision_opencv"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "vision_opencv"
ROS_BPN = "vision_opencv"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    image-geometry \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/dashing/vision_opencv/2.1.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "080b8bc2a758bba57983e257d27ab2a1"
SRC_URI[sha256sum] = "2b85fac94908259b25ddf4a6da4eef56b4ebeafcaa76efb10f08da730f87a9fc"
S = "${WORKDIR}/vision_opencv-release-release-dashing-vision_opencv-2.1.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('vision-opencv', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('vision-opencv', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-opencv/vision-opencv_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-opencv/vision-opencv-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-opencv/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-opencv/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
