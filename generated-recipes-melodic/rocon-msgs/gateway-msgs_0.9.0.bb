# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used by the gateway model."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/gateway_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

ROS_BPN = "gateway_msgs"

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

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/gateway_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b8729ce1b6dead053b8a7d5434cd7531"
SRC_URI[sha256sum] = "a9b6276a77498772c62e18a0f864bb657ab32a661cc4d7c150910462a4d97bc4"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-gateway_msgs-0.9.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rocon-msgs/rocon-msgs_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rocon-msgs/rocon-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/rocon-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
