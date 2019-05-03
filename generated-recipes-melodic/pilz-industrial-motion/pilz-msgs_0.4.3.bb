# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The pilz_msgs package"
AUTHOR = "Alexander Gutenkunst <a.gutenkunst@pilz.de>"
HOMEPAGE = "https://wiki.ros.org/pilz_msgs"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_BPN = "pilz_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    moveit-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    moveit-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    moveit-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_msgs/0.4.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "37dc59eb914de9c262e94370ac2bc08d"
SRC_URI[sha256sum] = "e736bde66232ef6ac7f047c8931818bd1aeafd2af58db649d31886928c5571fa"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_msgs-0.4.3-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('pilz-industrial-motion', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pilz-industrial-motion/pilz-industrial-motion_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pilz-industrial-motion/pilz-industrial-motion-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pilz-industrial-motion/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pilz-industrial-motion/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
