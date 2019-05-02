# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the python bindings PyKDL for the Kinematics and Dynamics     Library (KDL), distributed by the Orocos Project."
AUTHOR = "Ruben Smits <ruben@intermodalics.eu>"
HOMEPAGE = "http://wiki.ros.org/python_orocos_kdl"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_BPN = "python_orocos_kdl"

ROS_BUILD_DEPENDS = " \
    orocos-kdl \
    python-sip \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    catkin \
    orocos-kdl \
    python-sip \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    orocos-kdl \
    python-sip \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/orocos/orocos-kdl-release/archive/release/melodic/python_orocos_kdl/1.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "150762ff8a44859cce1d425d54b13990"
SRC_URI[sha256sum] = "e2f7f6fafccaf26d88863ac50b826301c14db71f61e4caff757a482e304a62a0"
S = "${WORKDIR}/orocos-kdl-release-release-melodic-python_orocos_kdl-1.4.0-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/orocos-kinematics-dynamics/orocos-kinematics-dynamics_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/orocos-kinematics-dynamics/orocos-kinematics-dynamics_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/orocos-kinematics-dynamics/orocos-kinematics-dynamics-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/orocos-kinematics-dynamics/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/orocos-kinematics-dynamics/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
