# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "depthimage_to_laserscan"
AUTHOR = "Chad Rockey <chadrockey@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/depthimage_to_laserscan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "depthimage_to_laserscan"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    gtest \
    image-geometry \
    image-transport \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    image-geometry \
    image-transport \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    image-geometry \
    image-transport \
    nodelet \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/depthimage_to_laserscan-release/archive/release/melodic/depthimage_to_laserscan/1.0.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "cf178b822c0dca354263212035de2aee"
SRC_URI[sha256sum] = "0620a9a74ab3a0601a55d1cbe593abe68bbc838ea3fb6a1dfa57ac7e6e3c10ca"
S = "${WORKDIR}/depthimage_to_laserscan-release-release-melodic-depthimage_to_laserscan-1.0.8-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/depthimage-to-laserscan/depthimage-to-laserscan_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/depthimage-to-laserscan/depthimage-to-laserscan_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/depthimage-to-laserscan/depthimage-to-laserscan-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/depthimage-to-laserscan/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/depthimage-to-laserscan/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
