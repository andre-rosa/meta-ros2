# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Cartographer is a system that provides real-time simultaneous localization     and mapping (SLAM) in 2D and 3D across multiple platforms and sensor     configurations."
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
HOMEPAGE = "https://github.com/googlecartographer/cartographer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b73cebba72f83c5afebf178817283e37"

ROS_BPN = "cartographer"

ROS_BUILD_DEPENDS = " \
    boost \
    cairo \
    ceres-solver \
    g++-static \
    gflags \
    gtest \
    libeigen \
    libgoogle-glog-dev \
    lua \
    protobuf \
    python-sphinx \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    cairo \
    ceres-solver \
    gflags \
    libeigen \
    libgoogle-glog-dev \
    lua \
    protobuf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    cairo \
    ceres-solver \
    gflags \
    libeigen \
    libgoogle-glog-dev \
    lua \
    protobuf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/cartographer-release/archive/release/crystal/cartographer/1.0.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "05ac2bce7f9b500ef1afca6706f01c41"
SRC_URI[sha256sum] = "8820033c5d07d4acc754b8fe40fb5aee18cdf065b3120e14e7c4fea5115b320c"
S = "${WORKDIR}/cartographer-release-release-crystal-cartographer-1.0.0-1"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/cartographer/cartographer_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/cartographer/cartographer_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cartographer/cartographer-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cartographer/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/cartographer/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
