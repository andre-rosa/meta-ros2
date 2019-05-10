# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Catkin wrapper for the official ARSDK from Parrot"
AUTHOR = "Mani Monajjemi <mmonajje@sfu.ca>"
ROS_AUTHOR = "Parrot S.A. <unknow@parrot.com>"
HOMEPAGE = "http://wiki.ros.org/parrot_arsdk"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "parrot_arsdk"
ROS_BPN = "parrot_arsdk"

ROS_BUILD_DEPENDS = " \
    curl \
    ffmpeg \
    libavahi-client-dev \
    libavahi-core-dev \
    libncurses-dev \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
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

SRC_URI = "https://github.com/AutonomyLab/parrot_arsdk-release/archive/release/melodic/parrot_arsdk/3.14.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dfb7956fd47a2a26e020355daacc9de5"
SRC_URI[sha256sum] = "7c12a877881ee154fb0899c3b8d365276cb5c7afc319859078e610ec06f66ec1"
S = "${WORKDIR}/parrot_arsdk-release-release-melodic-parrot_arsdk-3.14.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('parrot-arsdk', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('parrot-arsdk', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/parrot-arsdk/parrot-arsdk_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/parrot-arsdk/parrot-arsdk-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/parrot-arsdk/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/parrot-arsdk/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
