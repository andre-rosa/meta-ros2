# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "TRAC-IK is a faster, significantly more reliable drop-in replacement for     KDL's pseudoinverse Jacobian solver.      The TRAC-IK library has a very similar API to KDL's IK solver calls,     except that the user passes a maximum time instead of a maximum number of     search iterations.  Additionally, TRAC-IK allows for error tolerances to     be set independently for each Cartesian dimension (x,y,z,roll,pitch.yaw)."
AUTHOR = "Patrick Beeson <pbeeson@traclabs.com>"
ROS_AUTHOR = "Patrick Beeson"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "trac_ik"
ROS_BPN = "trac_ik_lib"

ROS_BUILD_DEPENDS = " \
    boost \
    cmake-modules \
    kdl-parser \
    libeigen \
    libnlopt-dev \
    pkgconfig \
    roscpp \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    kdl-parser \
    libnlopt-dev \
    libnlopt0 \
    roscpp \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    kdl-parser \
    libnlopt-dev \
    libnlopt0 \
    roscpp \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/melodic/trac_ik_lib/1.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c29de93ad99ec4a38b345975f7b47157"
SRC_URI[sha256sum] = "f538a70b479132fa717c5a81ac3d9c8e217daffe1fae8467d9e71f51f28cb39c"
S = "${WORKDIR}/trac_ik-release-release-melodic-trac_ik_lib-1.5.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('trac-ik', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('trac-ik', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/trac-ik/trac-ik_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/trac-ik/trac-ik-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/trac-ik/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/trac-ik/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
