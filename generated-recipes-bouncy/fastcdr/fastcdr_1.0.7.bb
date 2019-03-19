# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "CDR serialization implementation."
AUTHOR = "Steven! Ragnarök <stevenragnarok@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "fastcdr"
ROS_BPN = "fastcdr"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/fastcdr-release/archive/release/bouncy/fastcdr/1.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2fa2e48286c2d80745426c7616befbc7"
SRC_URI[sha256sum] = "630f24ec498098e340794ea5061043561fb0388fce7e2af3a3614aac0a27cfd1"
S = "${WORKDIR}/fastcdr-release-release-bouncy-fastcdr-1.0.7-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('fastcdr', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('fastcdr', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fastcdr/fastcdr_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fastcdr/fastcdr-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fastcdr/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fastcdr/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
