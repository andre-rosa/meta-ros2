# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library for capturing data from the Intel(R) RealSense(TM) SR300 and D400 cameras. This effort was initiated to better support researchers, creative coders, and app developers in domains such as robotics, virtual reality, and the internet of things. Several often-requested features of RealSense(TM); devices are implemented in this project, including multi-camera capture."
AUTHOR = "Sergey Dorodnicov <sergey.dorodnicov@intel.com>"
HOMEPAGE = "https://github.com/IntelRealSense/librealsense/"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=24;endline=24;md5=e8978a5103d23266fc6f8ec03dc9eb16"

ROS_BUILD_DEPENDS = " \
    dkms \
    eudev \
    glfw \
    gtk+3 \
    libusb1 \
    linux-headers-generic \
    mesa \
    openssl \
    pkgconf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    dkms \
    eudev \
    glfw \
    gtk+3 \
    libusb1 \
    linux-headers-generic \
    mesa \
    openssl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dkms \
    eudev \
    glfw \
    gtk+3 \
    libusb1 \
    linux-headers-generic \
    mesa \
    openssl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/librealsense-release/archive/release/crystal/librealsense2/2.16.5-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4c5b4cdf1c029e1163baa004464c0385"
SRC_URI[sha256sum] = "cb95505e6a9a4d16ebb6ca7542eee7bca1afdfca36fd46aa6de30cb011d96b97"
S = "${WORKDIR}/librealsense-release-release-crystal-librealsense2-2.16.5-2"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/librealsense/librealsense_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/librealsense/librealsense_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/librealsense/librealsense-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/librealsense/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/librealsense/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
