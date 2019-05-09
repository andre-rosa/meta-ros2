# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "ROS messages for universally unique identifiers."
AUTHOR = "Jack O'Quin <jack.oquin@gmail.com>"
ROS_AUTHOR = "Jack O'Quin"
HOMEPAGE = "http://ros.org/wiki/uuid_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "unique_identifier"
ROS_BPN = "uuid_msgs"

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

SRC_URI = "https://github.com/ros-geographic-info/unique_identifier-release/archive/release/melodic/uuid_msgs/1.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9f4648546d9f9ad348ec077c524f5222"
SRC_URI[sha256sum] = "c00cacdbfc12e1cc2715a8531eae1fc69700362b2abab974d03d70de5de6d2b5"
S = "${WORKDIR}/unique_identifier-release-release-melodic-uuid_msgs-1.0.6-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('unique-identifier', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('unique-identifier', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/unique-identifier/unique-identifier_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/unique-identifier/unique-identifier-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/unique-identifier/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/unique-identifier/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
