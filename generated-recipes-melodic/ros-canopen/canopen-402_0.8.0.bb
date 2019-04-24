# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This implements the CANopen device profile for drives and motion control. CiA(r) 402"
AUTHOR = "Mathias Lüdtke <mathias.luedtke@ipa.fraunhofer.de>"
HOMEPAGE = "http://wiki.ros.org/canopen_402"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_BUILD_DEPENDS = " \
    canopen-master \
    class-loader \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    canopen-master \
    class-loader \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    canopen-master \
    class-loader \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_402/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0f172d53d77a8a39ba696645aea05a7d"
SRC_URI[sha256sum] = "efde470bfc5b7f1a067d861078f5de826f05e7af4bb8dd3456f51664961d1b2c"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_402-0.8.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ros-canopen/ros-canopen_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ros-canopen/ros-canopen_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-canopen/ros-canopen-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-canopen/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-canopen/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
