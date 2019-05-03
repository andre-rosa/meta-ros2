# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Messages used by the rocon scheduler."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/scheduler_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=5ee5b8b046ae48ad94a2037ca953a67b"

ROS_BPN = "scheduler_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    rocon-std-msgs \
    std-msgs \
    uuid-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    rocon-std-msgs \
    std-msgs \
    uuid-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    rocon-std-msgs \
    std-msgs \
    uuid-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/scheduler_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f90d8702972bd8c379c67805efa36bd0"
SRC_URI[sha256sum] = "1b4d4544455c6a6b0cd9dfa8388e3f497ada0125fd906b544ccdb0d23a491a71"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-scheduler_msgs-0.9.0-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('rocon-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/rocon-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/rocon-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
