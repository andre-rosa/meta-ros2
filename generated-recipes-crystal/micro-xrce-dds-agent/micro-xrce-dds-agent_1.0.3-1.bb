# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "DDS-XCRE agent implementation"
AUTHOR = "Borja Outerelo <borjaouterelo@eprosima.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "micro-xrce-dds-agent"
ROS_BPN = "micro-xrce-dds-agent"

ROS_BUILD_DEPENDS = " \
    asio \
    fastcdr \
    fastrtps \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    fastcdr \
    fastrtps \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fastcdr \
    fastrtps \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/micro-ROS/Micro-XRCE-DDS-Agent-release/archive/release/crystal/micro-xrce-dds-agent/1.0.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6eb669df3a174efe93cc4299977e252b"
SRC_URI[sha256sum] = "2527ae37b394541a98465ecdfbf05b9de141c0b66a1675ccf19f7e149d7ff765"
S = "${WORKDIR}/Micro-XRCE-DDS-Agent-release-release-crystal-micro-xrce-dds-agent-1.0.3-1"

ROS_BUILD_TYPE = "cmake"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('micro-xrce-dds-agent', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('micro-xrce-dds-agent', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/micro-xrce-dds-agent/micro-xrce-dds-agent_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/micro-xrce-dds-agent/micro-xrce-dds-agent-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/micro-xrce-dds-agent/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/micro-xrce-dds-agent/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
