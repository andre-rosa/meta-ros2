# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cl_urdf"
AUTHOR = "Gayane Kazhoyan <kazhoyan@cs.uni-bremen.de>"
HOMEPAGE = "http://ros.org/wiki/cl_urdf"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cl-transforms \
    roslisp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cl-transforms \
    roslisp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_urdf/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f6b9c14fcf43e756f04d1b8c04f76f94"
SRC_URI[sha256sum] = "d2b3ee247057cc0bee65484510f44e0342fff7fc1efcbfc4545914edf5efaa72"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_urdf-0.2.10-0"

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
