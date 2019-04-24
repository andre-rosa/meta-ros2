# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Contains messages and services for MAV communication"
AUTHOR = "Rik Bähnemann <brik@ethz.ch>"
ROS_AUTHOR = "Simon Lynen"
HOMEPAGE = "https://github.com/ethz-asl/mav_comm"
SECTION = "devel"
LICENSE = "ASL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

ROS_CN = "mav_comm"
ROS_BPN = "mav_comm"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    mav-msgs \
    mav-planning-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    mav-msgs \
    mav-planning-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ethz-asl/mav_comm-release/archive/release/melodic/mav_comm/3.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9fefa0b77223e36fbceae186e44fe68f"
SRC_URI[sha256sum] = "58c58a99785c47a9b06a616dfc6d579251b7a18caf26b6acb7702fab69df27cc"
S = "${WORKDIR}/mav_comm-release-release-melodic-mav_comm-3.3.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('mav-comm', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('mav-comm', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mav-comm/mav-comm_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mav-comm/mav-comm-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mav-comm/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mav-comm/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
