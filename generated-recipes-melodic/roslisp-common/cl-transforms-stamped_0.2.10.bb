# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implementation of TF datatypes"
AUTHOR = "Gayane Kazhoyan <kazhoyan@cs.uni-bremen.de>"
HOMEPAGE = "http://ros.org/wiki/cl_transforms_stamped"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cl-transforms \
    geometry-msgs \
    roslisp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cl-transforms \
    geometry-msgs \
    roslisp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_transforms_stamped/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "11ebac5b92281dcd11d2d26af6564987"
SRC_URI[sha256sum] = "8bb4cba56d66bb1a706d682930d296c70c682782f71a4843f623e386bec7c834"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_transforms_stamped-0.2.10-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/roslisp-common/roslisp-common_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/roslisp-common/roslisp-common_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roslisp-common/roslisp-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roslisp-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roslisp-common/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
