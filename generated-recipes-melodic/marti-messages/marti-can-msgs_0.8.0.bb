# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_can_msgs"
AUTHOR = "Marc Alban <malban@swri.org>"
HOMEPAGE = "https://github.com/swri-robotics/marti_messages"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "marti_can_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
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

SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/melodic/marti_can_msgs/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "07935374948bc2b7aca7c2936c92ab9f"
SRC_URI[sha256sum] = "7b3911514a817dc446751e19aac37c1bcda4e6c4abb47db837c0e77c0d422a53"
S = "${WORKDIR}/marti_messages-release-release-melodic-marti_can_msgs-0.8.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/marti-messages/marti-messages_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/marti-messages/marti-messages_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-messages/marti-messages-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-messages/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-messages/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
