# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Lisp client library for ROS, the Robot Operating System."
AUTHOR = "Gayane Kazhoyan <kazhoyan@cs.uni-bremen.de>"
ROS_AUTHOR = "Bhaskara Marthi"
HOMEPAGE = "http://ros.org/wiki/roslisp"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "roslisp"
ROS_BPN = "roslisp"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rosgraph-msgs \
    roslang \
    rospack \
    sbcl \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosgraph-msgs \
    roslang \
    rospack \
    sbcl \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/roslisp-release/archive/release/melodic/roslisp/1.9.22-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "717583e59edbf7c03721f9438881dae3"
SRC_URI[sha256sum] = "83844af11c1d8a5baf84efcef5a107629966d66b14973723446cd8803fc9781a"
S = "${WORKDIR}/roslisp-release-release-melodic-roslisp-1.9.22-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('roslisp', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('roslisp', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roslisp/roslisp_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roslisp/roslisp-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roslisp/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roslisp/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
