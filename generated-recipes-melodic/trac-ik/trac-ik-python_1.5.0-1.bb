# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The trac_ik_python package contains a python wrapper using SWIG   for trac_ik_lib"
AUTHOR = "Sam Pfeiffer <Sammy.Pfeiffer@student.uts.edu.au>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    rospy \
    swig \
    tf-conversions \
    trac-ik-lib \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rospy \
    swig \
    tf \
    tf-conversions \
    trac-ik-lib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rospy \
    swig \
    tf \
    tf-conversions \
    trac-ik-lib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/melodic/trac_ik_python/1.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "49b292617aa2502f01353268c2fcb498"
SRC_URI[sha256sum] = "d61541a1eb22c8c6af749e058557fdbd0259fe89d4045230871a54b60666a5e1"
S = "${WORKDIR}/trac_ik-release-release-melodic-trac_ik_python-1.5.0-1"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/trac-ik/trac-ik_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/trac-ik/trac-ik_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/trac-ik-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/trac-ik/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
