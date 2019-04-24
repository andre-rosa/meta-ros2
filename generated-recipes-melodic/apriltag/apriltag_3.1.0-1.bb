# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "AprilTag detector library"
AUTHOR = "Max Krogius <mkrogius@umich.edu>"
ROS_AUTHOR = "Edwin Olson <ebolson@umich.edu>"
HOMEPAGE = "https://april.eecs.umich.edu/software/apriltag.html"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "apriltag"
ROS_BPN = "apriltag"

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

SRC_URI = "https://github.com/AprilRobotics/apriltag-release/archive/release/melodic/apriltag/3.1.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ebf93b6d55eb497ed4e184f0a272524d"
SRC_URI[sha256sum] = "d4617c7e9e07f8f35b2c1cb4e41c3dbe3b4be42dd00a78f5072faa62cce8cfd0"
S = "${WORKDIR}/apriltag-release-release-melodic-apriltag-3.1.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('apriltag', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('apriltag', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/apriltag/apriltag_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/apriltag/apriltag-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/apriltag/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/apriltag/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
