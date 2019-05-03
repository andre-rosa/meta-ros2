# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package contains a recent version of the Kinematics and Dynamics     Library (KDL), distributed by the Orocos Project."
AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
HOMEPAGE = "http://wiki.ros.org/orocos_kdl"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_BPN = "orocos_kdl"

ROS_BUILD_DEPENDS = " \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
    pkgconfig \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    cppunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/orocos_kinematics_dynamics-release/archive/release/crystal/orocos_kdl/3.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8fcdd0c6d26d78c32312666c31893df4"
SRC_URI[sha256sum] = "2c444773f68360b316d826a5bf7c0f12e9a3989d90eb2d350e703a6226a4303e"
S = "${WORKDIR}/orocos_kinematics_dynamics-release-release-crystal-orocos_kdl-3.1.0-0"

ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('orocos-kinematics-dynamics', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/orocos-kinematics-dynamics/orocos-kinematics-dynamics_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/orocos-kinematics-dynamics/orocos-kinematics-dynamics-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/orocos-kinematics-dynamics/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/orocos-kinematics-dynamics/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
