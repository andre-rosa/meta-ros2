# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Mobile Robot Programming Toolkit (MRPT) version 2.x"
AUTHOR = "Jose-Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
HOMEPAGE = "https://www.mrpt.org/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "mrpt2"

ROS_BUILD_DEPENDS = " \
    assimp \
    eudev \
    ffmpeg \
    freeglut \
    libeigen \
    libjpeq-turbo \
    libpcap \
    libusb1 \
    opencv \
    suitesparse \
    wxwidgets \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    assimp \
    eudev \
    ffmpeg \
    freeglut \
    libeigen \
    libjpeq-turbo \
    libpcap \
    libusb1 \
    opencv \
    suitesparse \
    wxwidgets \
    zlib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assimp \
    eudev \
    ffmpeg \
    freeglut \
    libeigen \
    libjpeq-turbo \
    libpcap \
    libusb1 \
    opencv \
    suitesparse \
    wxwidgets \
    zlib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/mrpt-ros2-pkg-release/mrpt2-release/archive/release/crystal/mrpt2/1.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b313a65bd0cf50ed8dae3efe1fe00170"
SRC_URI[sha256sum] = "f53bc01e9cecf69776f34c50e4ca8e675327efca9f672b3cf5a4ef8ba5c2631d"
S = "${WORKDIR}/mrpt2-release-release-crystal-mrpt2-1.9.9-0"

ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('mrpt2', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt2/mrpt2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt2/mrpt2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt2/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
