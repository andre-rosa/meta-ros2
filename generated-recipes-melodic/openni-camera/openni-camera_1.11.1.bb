# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "A ROS driver for OpenNI depth (+ RGB) cameras. These include:         Microsoft Kinect,        PrimeSense PSDK,        ASUS Xtion Pro and Pro Live      The driver publishes raw depth, RGB, and IR image streams."
AUTHOR = "Isaac I.Y. Saito <130s@2000.jukuin.keio.ac.jp>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://www.ros.org/wiki/openni_camera"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "openni_camera"
ROS_BPN = "openni_camera"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    dynamic-reconfigure \
    image-transport \
    libopenni-dev \
    libusb1 \
    log4cxx \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-info-manager \
    dynamic-reconfigure \
    image-transport \
    libopenni-dev \
    libusb1 \
    log4cxx \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    dynamic-reconfigure \
    image-transport \
    libopenni-dev \
    libusb1 \
    log4cxx \
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

SRC_URI = "https://github.com/ros-gbp/openni_camera-release/archive/release/melodic/openni_camera/1.11.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a74a7949a861dc26e3bb7e0ddb81e055"
SRC_URI[sha256sum] = "0efa907d200aa0506d664882b0083f992ee2855b36d890c7b334bdc3a5241e2e"
S = "${WORKDIR}/openni_camera-release-release-melodic-openni_camera-1.11.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('openni-camera', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('openni-camera', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/openni-camera/openni-camera_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/openni-camera/openni-camera-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/openni-camera/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/openni-camera/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
