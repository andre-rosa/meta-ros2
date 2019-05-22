# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Collision checking using the FCL library."
AUTHOR = "Vladimir Ivan <v.ivan@ed.ac.uk>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "exotica"
ROS_BPN = "exotica_collision_scene_fcl"

ROS_BUILD_DEPENDS = " \
    exotica-core \
    geometric-shapes \
    libfcl-dev \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    exotica-core \
    geometric-shapes \
    libfcl-dev \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    exotica-core \
    geometric-shapes \
    libfcl-dev \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_collision_scene_fcl/5.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "241cf18698f9c3f4443e2f2eed76a14e"
SRC_URI[sha256sum] = "23429b82aedb7a582949ddaf683f933d6faea4923f01cd71d129e755899ac649"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_collision_scene_fcl-5.0.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('exotica', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('exotica', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/exotica/exotica_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/exotica/exotica-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/exotica/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/exotica/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
