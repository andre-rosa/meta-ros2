# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Messages used by workflow engine"
AUTHOR = "Dongwook Lee <dwlee@yujinrobot.com>"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

ROS_BPN = "concert_workflow_engine_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/concert_workflow_engine_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f97827b29688829d8741ab3f3756563c"
SRC_URI[sha256sum] = "2911128ce6bda4648b1264133cbcd10cb6be12c413bd50523089ff9e93699a0a"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-concert_workflow_engine_msgs-0.9.0-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('rocon-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/rocon-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/rocon-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
