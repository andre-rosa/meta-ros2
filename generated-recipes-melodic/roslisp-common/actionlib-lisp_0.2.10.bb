# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "actionlib_lisp is a native implementation of the famous actionlib    in Common Lisp. It provides a client and a simple server."
AUTHOR = "Gayane Kazhoyan <kazhoyan@cs.uni-bremen.de>"
ROS_AUTHOR = "Bhaskara Marthi"
HOMEPAGE = "http://wiki.ros.org/actionlib_lisp"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "roslisp_common"
ROS_BPN = "actionlib_lisp"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib-msgs \
    cl-utils \
    message-runtime \
    roslisp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    cl-utils \
    message-runtime \
    roslisp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/actionlib_lisp/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "74f5a2d8fba8c79aeabd4b1cb87336ce"
SRC_URI[sha256sum] = "f7d69b33db5ed3ca13e17699bb8ec2fb18612b3f193f7bbaa46b9be73877a7bc"
S = "${WORKDIR}/roslisp_common-release-release-melodic-actionlib_lisp-0.2.10-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('roslisp-common', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('roslisp-common', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/roslisp-common/roslisp-common_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/roslisp-common/roslisp-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/roslisp-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/roslisp-common/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
