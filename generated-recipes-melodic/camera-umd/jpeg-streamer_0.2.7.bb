# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tools for streaming JPEG-formatted CompressedImage topics over HTTP"
AUTHOR = "Ken Tossell <ken@tossell.net>"
HOMEPAGE = "http://ros.org/wiki/jpeg_streamer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_BPN = "jpeg_streamer"

ROS_BUILD_DEPENDS = " \
    image-transport \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    image-transport \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    image-transport \
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

SRC_URI = "https://github.com/ros-drivers-gbp/camera_umd-release/archive/release/melodic/jpeg_streamer/0.2.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2b69d878661e49f4de015f0c2ecbd38e"
SRC_URI[sha256sum] = "2f2d7e91f8743383d48353d1fc7fbbcd47ad1438a9029949cdd499ce3885e221"
S = "${WORKDIR}/camera_umd-release-release-melodic-jpeg_streamer-0.2.7-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/camera-umd/camera-umd_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/camera-umd/camera-umd_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/camera-umd/camera-umd-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/camera-umd/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/camera-umd/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
