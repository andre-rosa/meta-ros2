# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "An application used to systematically record rosbags"
AUTHOR = "Brenden Gibbons <bgibbons@squarerobots.com>"
ROS_AUTHOR = "Brenden Gibbons <bgibbons@squarerobots.com>"
HOMEPAGE = "http://www.ros.org/wiki/bagger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "bagger"
ROS_BPN = "bagger"

ROS_BUILD_DEPENDS = " \
    message-generation \
    roscpp \
    roslint \
    rostest \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    rostest \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    rosbag \
    roscpp \
    rospy \
    rostest \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/squarerobot/bagger-release/archive/release/melodic/bagger/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4b34beec44accf14d262a5d206e03891"
SRC_URI[sha256sum] = "e8275de0f4ad29f758472ae12d8ce534b53705ec57066e8611498b6077188226"
S = "${WORKDIR}/bagger-release-release-melodic-bagger-0.1.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('bagger', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('bagger', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/bagger/bagger_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/bagger/bagger-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/bagger/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/bagger/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
